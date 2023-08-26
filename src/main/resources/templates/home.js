document.addEventListener("DOMContentLoaded", function() {
    // Simulate API call to retrieve user data
    axios.get('http://localhost:8081/selectTeacher')
        .then(response => {
            const userData = response.data;
            populateTable(userData);
        })
        .catch(error => {
            console.error('Error:', error);
            alert('An error occurred while trying to fetch user data.');
        });
});

function populateTable(userData) {
    const tableBody = document.querySelector("#userTable tbody");

    userData.forEach(user => {
        const row = document.createElement("tr");
        row.innerHTML = `
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.email}</td>
        `;
        tableBody.appendChild(row);
    });
}
