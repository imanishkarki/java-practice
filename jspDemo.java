<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Form Submission Result</title>
</head>
<body>
    <h1>Form Submission Result</h1>

    <%
        // Retrieve form data from request parameters
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Validate data (basic example)
        if (name == null || email == null || password == null || name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            out.println("<p style='color:red;'>All fields are required!</p>");
        } else {
            // Display the data
    %>
            <p>Thank you, <strong><%= name %></strong>, for registering!</p>
            <p>Your email: <%= email %></p>
            <p>Your password: <%= password %> (not recommended to display in real applications)</p>
    <%
        }
    %>
</body>
</html>


