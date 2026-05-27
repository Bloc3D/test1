function addProduct() {
    const name = document.getElementById("nameInput").value;

    fetch("http://localhost:8080/api/products", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({ name: name })
    })
        .then(response => response.json())
        .then(data => {
            document.getElementById("result").innerText =
                "Created product: " + data.id + " - " + data.name;
        })
        .catch(error => console.error("Error:", error));
}
