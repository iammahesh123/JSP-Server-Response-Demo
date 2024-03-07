<%@ page import="demo.UserData"  language="java" contentType="text/html;  charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Data</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 600px;
            margin: 20px auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #333;
            text-align: center;
        }
        .userData {
            margin-bottom: 10px;
        }
        .userData p {
            margin: 10px 0;
        }
        .userData p strong {
            font-weight: bold;
            margin-right: 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>User Data</h1>
        <div class="userData">
            <p><strong>User ID:</strong> <%= request.getParameter("userId") %></p>
            <% 
                UserData userData = (UserData) request.getAttribute("userData");
                if (userData != null) {
            %>
            <p><strong>Name:</strong> <%= userData.getName() %></p>
            <p><strong>Education:</strong> <%= userData.getEducation() %></p>
            <p><strong>Occupation:</strong> <%= userData.getOccupation() %></p>
            <% } else { %>
            <p>User data not found.</p>
            <% } %>
        </div>
    </div>
</body>
</html>
