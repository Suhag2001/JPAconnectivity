    document.getElementById('signupForm').addEventListener('submit', function(event) {
      event.preventDefault(); // Prevent the form from submitting normally

      const username = document.getElementById('username').value;
      const email = document.getElementById('email').value;
      const password = document.getElementById('password').value;

      const signupData = {
        username: username,
        email: email,
        password: password
      };

      const apiUrl = "http://localhost:8081/insertTeacher"; // Replace with your API URL

      axios.post(apiUrl, signupData, {
      method: "POST",
        headers: {
          'Content-Type': 'application/json'
        }
      })
      .then(response => {
        // Handle the response data
        console.log(response.data);
        alert('Signup successful!');
      })
      .catch(error => {
        console.error("Error:", error);
        alert('An error occurred during signup.');
      });
    });

