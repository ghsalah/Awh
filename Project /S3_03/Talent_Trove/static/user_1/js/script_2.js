// gallery

document.addEventListener('DOMContentLoaded', function () {
    const lightbox = document.getElementById('lightbox');
    const lightboxImg = lightbox.querySelector('.lightbox-img');
    const galleryItems = document.querySelectorAll('.gallery-item img');
    const closeBtn = lightbox.querySelector('.lightbox-close');
    const prevBtn = lightbox.querySelector('.lightbox-prev');
    const nextBtn = lightbox.querySelector('.lightbox-next');

    let currentIndex = 0;

    function openLightbox(index) {
        lightboxImg.src = galleryItems[index].src;
        lightbox.style.display = 'flex';
        currentIndex = index;
    }

    function closeLightbox() {
        lightbox.style.display = 'none';
    }

    function showPrevImage() {
        currentIndex = (currentIndex - 1 + galleryItems.length) % galleryItems.length;
        openLightbox(currentIndex);
    }

    function showNextImage() {
        currentIndex = (currentIndex + 1) % galleryItems.length;
        openLightbox(currentIndex);
    }

    galleryItems.forEach((img, index) => {
        img.addEventListener('click', () => openLightbox(index));
    });

    closeBtn.addEventListener('click', closeLightbox);
    prevBtn.addEventListener('click', showPrevImage);
    nextBtn.addEventListener('click', showNextImage);
});

//posts////////////////////////////////


document.addEventListener('DOMContentLoaded', function () {
    // Select all nav items (li elements)
    const navItems = document.querySelectorAll('.nav-item');
    // Select all sections
    const sections = document.querySelectorAll('.content-section > div');

    // Function to handle tab clicks
    function handleTabClick(event) {
        event.preventDefault();

        // Ensure we get the closest parent with the class 'nav-item'
        const clickedNavItem = event.target.closest('.nav-item');

        if (clickedNavItem) {
            // Remove 'active' class from all nav items
            navItems.forEach(item => item.classList.remove('active'));

            // Add 'active' class to the clicked nav item
            clickedNavItem.classList.add('active');

            // Hide all sections
            sections.forEach(section => section.style.display = 'none');

            // Show the corresponding section
            const clickedTabId = clickedNavItem.querySelector('.nav-link').id;
            const sectionToShow = document.getElementById(clickedTabId.replace('-tab', ''));
            if (sectionToShow) {
                sectionToShow.style.display = 'block';
            }
        }
    }

    // Attach event listener to each nav item
    navItems.forEach(item => {
        item.addEventListener('click', handleTabClick);
    });

    // Toggle job details when clicking the job title
    const jobTitles = document.querySelectorAll('.job-title');
    jobTitles.forEach(title => {
        title.addEventListener('click', function () {
            const jobDetails = this.nextElementSibling;
            if (jobDetails.style.display === "block") {
                jobDetails.style.display = "none";
            } else {
                jobDetails.style.display = "block";
            }
        });
    });

    // Delete button functionality
    const deleteButtons = document.querySelectorAll('.delete-btn');
    deleteButtons.forEach(button => {
        button.addEventListener('click', () => {
            const applicationItem = button.closest('.application-item');
            applicationItem.remove(); // Remove the job application item
        });
    });
});




