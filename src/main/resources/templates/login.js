document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;


   const apiUrl = `http://localhost:8081/findByEmail/${email}`;
    // Simulate API call to retrieve user data based on email
    axios.get(apiUrl)
        .then(response => {
            // Check if user data was found
            if (response.data) {
                // Simulate password validation (replace with your actual validation code)
                if (response.data.password === password) {
                    alert('Login successful');
                  // Store user ID in local storage
                 localStorage.setItem('userId', response.data.id);
                    // Redirect to home page
                    window.location.href = "home.html";
                } else {
                    alert('Invalid password');
                }
            } else {
                alert('User not found');
            }
        })
        .catch(error => {
            console.error('Error:', error);
            alert('An error occurred while trying to log in.');
        });
});
