class NWLogo3D {
    constructor(containerId) {
        this.containerId = containerId;
        this.container = document.getElementById(containerId);
        if (!this.container) {
            console.error('Container not found:', containerId);
            return;
        }
        this.init();
    }

    init() {
        // Scene setup
        this.scene = new THREE.Scene();
        this.camera = new THREE.PerspectiveCamera(45,
            this.container.clientWidth / this.container.clientHeight, 0.1, 1000);
        this.camera.position.set(0, 0, 12);

        // Renderer
        this.renderer = new THREE.WebGLRenderer({ antialias: true, alpha: true });
        this.renderer.setSize(this.container.clientWidth, this.container.clientHeight);
        this.renderer.setClearColor(0x000000, 0);
        this.renderer.shadowMap.enabled = true;
        this.renderer.shadowMap.type = THREE.PCFSoftShadowMap;
        this.container.appendChild(this.renderer.domElement);

        // Logo group
        this.logoGroup = new THREE.Group();
        this.scene.add(this.logoGroup);

        // Create logo
        this.createNWLogo();
        this.setupLights();
        this.setupEventListeners();
        this.animate();

        // Handle resize
        this.handleResize();
    }

    createNWLogo() {
        const extrudeSettings = {
            depth: 1.5,
            bevelEnabled: true,
            bevelSegments: 8,
            bevelSize: 0.1,
            bevelThickness: 0.1
        };

        // N Shape
        const nShape = new THREE.Shape();
        nShape.moveTo(-2, -3);
        nShape.lineTo(-1, -3);
        nShape.lineTo(-1, 1);
        nShape.lineTo(0.5, -1.5);
        nShape.lineTo(0.5, -3);
        nShape.lineTo(1.5, -3);
        nShape.lineTo(1.5, 3);
        nShape.lineTo(0.5, 3);
        nShape.lineTo(0.5, 1);
        nShape.lineTo(-1, 2.5);
        nShape.lineTo(-1, 3);
        nShape.lineTo(-2, 3);
        nShape.lineTo(-2, -3);

        // W Shape (corregida)
        const wShape = new THREE.Shape();
        wShape.moveTo(0.5, 3);
        wShape.lineTo(1.2, 3);
        wShape.lineTo(1.9, -1);
        wShape.lineTo(2.5, 1);
        wShape.lineTo(3.1, -1);
        wShape.lineTo(3.8, 3);
        wShape.lineTo(4.5, 3);
        wShape.lineTo(4.5, -3);
        wShape.lineTo(3.6, -3);
        wShape.lineTo(2.8, 0);
        wShape.lineTo(2.5, -1.5);
        wShape.lineTo(2.2, 0);
        wShape.lineTo(1.4, -3);
        wShape.lineTo(0.5, -3);
        wShape.lineTo(0.5, 3);

        // Create geometries
        const nGeometry = new THREE.ExtrudeGeometry(nShape, extrudeSettings);
        const wGeometry = new THREE.ExtrudeGeometry(wShape, extrudeSettings);

        // Materials
        const nMaterial = new THREE.MeshPhongMaterial({
            color: 0x00ffff,
            shininess: 100,
            transparent: true,
            opacity: 0.9
        });

        const wMaterial = new THREE.MeshPhongMaterial({
            color: 0x8a2be2,
            shininess: 100,
            transparent: true,
            opacity: 0.9
        });

        // Create meshes
        const nMesh = new THREE.Mesh(nGeometry, nMaterial);
        const wMesh = new THREE.Mesh(wGeometry, wMaterial);

        nMesh.position.set(-1.5, 0, 0);
        wMesh.position.set(1, 0, 0);

        nMesh.castShadow = true;
        nMesh.receiveShadow = true;
        wMesh.castShadow = true;
        wMesh.receiveShadow = true;

        this.logoGroup.add(nMesh);
        this.logoGroup.add(wMesh);

        this.createParticles();
    }

    createParticles() {
        const particlesGeometry = new THREE.BufferGeometry();
        const particlesCount = 50; // Reducido para mejor performance en Vaadin
        const positions = new Float32Array(particlesCount * 3);
        const colors = new Float32Array(particlesCount * 3);

        for (let i = 0; i < particlesCount; i++) {
            const i3 = i * 3;
            positions[i3] = (Math.random() - 0.5) * 15;
            positions[i3 + 1] = (Math.random() - 0.5) * 15;
            positions[i3 + 2] = (Math.random() - 0.5) * 8;

            const t = Math.random();
            if (t < 0.33) {
                colors[i3] = 0; colors[i3 + 1] = 1; colors[i3 + 2] = 1;
            } else if (t < 0.66) {
                colors[i3] = 1; colors[i3 + 1] = 0; colors[i3 + 2] = 1;
            } else {
                colors[i3] = 0.5; colors[i3 + 1] = 0.2; colors[i3 + 2] = 0.9;
            }
        }

        particlesGeometry.setAttribute('position', new THREE.BufferAttribute(positions, 3));
        particlesGeometry.setAttribute('color', new THREE.BufferAttribute(colors, 3));

        const particlesMaterial = new THREE.PointsMaterial({
            size: 0.05,
            vertexColors: true,
            transparent: true,
            opacity: 0.6
        });

        const particles = new THREE.Points(particlesGeometry, particlesMaterial);
        this.scene.add(particles);
    }

    setupLights() {
        const ambientLight = new THREE.AmbientLight(0x404040, 0.3);
        this.scene.add(ambientLight);

        const directionalLight = new THREE.DirectionalLight(0xffffff, 0.8);
        directionalLight.position.set(5, 5, 5);
        directionalLight.castShadow = true;
        this.scene.add(directionalLight);

        const cyanLight = new THREE.PointLight(0x00ffff, 0.6, 20);
        cyanLight.position.set(-5, 2, 3);
        this.scene.add(cyanLight);

        const magentaLight = new THREE.PointLight(0xff00ff, 0.6, 20);
        magentaLight.position.set(5, -2, 3);
        this.scene.add(magentaLight);
    }

    setupEventListeners() {
        this.mouseX = 0;
        this.mouseY = 0;
        this.targetRotationX = 0;
        this.targetRotationY = 0;
        this.isMouseDown = false;

        this.container.addEventListener('mousedown', (e) => this.onMouseDown(e));
        this.container.addEventListener('mousemove', (e) => this.onMouseMove(e));
        this.container.addEventListener('mouseup', () => this.onMouseUp());
        this.container.addEventListener('wheel', (e) => this.onMouseWheel(e));
    }

    onMouseDown(event) {
        this.isMouseDown = true;
        this.mouseX = event.clientX;
        this.mouseY = event.clientY;
    }

    onMouseMove(event) {
        if (!this.isMouseDown) return;

        const deltaX = event.clientX - this.mouseX;
        const deltaY = event.clientY - this.mouseY;

        this.targetRotationY += deltaX * 0.01;
        this.targetRotationX += deltaY * 0.01;

        this.mouseX = event.clientX;
        this.mouseY = event.clientY;
    }

    onMouseUp() {
        this.isMouseDown = false;
    }

    onMouseWheel(event) {
        this.camera.position.z += event.deltaY * 0.01;
        this.camera.position.z = Math.max(5, Math.min(20, this.camera.position.z));
    }

    handleResize() {
        window.addEventListener('resize', () => {
            if (this.container && this.camera && this.renderer) {
                this.camera.aspect = this.container.clientWidth / this.container.clientHeight;
                this.camera.updateProjectionMatrix();
                this.renderer.setSize(this.container.clientWidth, this.container.clientHeight);
            }
        });
    }

    animate() {
        requestAnimationFrame(() => this.animate());

        if (this.logoGroup) {
            this.logoGroup.rotation.x += (this.targetRotationX - this.logoGroup.rotation.x) * 0.05;
            this.logoGroup.rotation.y += (this.targetRotationY - this.logoGroup.rotation.y) * 0.05;

            if (!this.isMouseDown) {
                this.targetRotationY += 0.005;
            }

            this.logoGroup.position.y = Math.sin(Date.now() * 0.001) * 0.2;
        }

        if (this.renderer && this.scene && this.camera) {
            this.renderer.render(this.scene, this.camera);
        }
    }

    destroy() {
        if (this.renderer) {
            this.container.removeChild(this.renderer.domElement);
            this.renderer.dispose();
        }
    }
}

// Global function para Vaadin
// Versión alternativa: NWLogo3D_2
window.NWLogo3D_2 = NWLogo3D;
window.initNWLogo2 = function(containerId) {
    return new NWLogo3D(containerId);
};