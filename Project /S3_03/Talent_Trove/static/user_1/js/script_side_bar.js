function toggleSidebar() {
    document.querySelector('.sidebar').classList.toggle('expanded');
}

function setActive(element) {
    document.querySelectorAll('.nav-item').forEach(item => item.classList.remove('active'));
    element.classList.add('active');
}
