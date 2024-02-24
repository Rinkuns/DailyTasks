<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<style>
.container {
  width: 80%;
  margin: 0 auto;
}
h2 {
  font-family: fantasy;
  font-size: 24px;
  text-align: center;
}

.table {
  width: 100%;
  border-collapse: collapse;
  margin-top: 20px;
}

.table th, .table td {
  padding: 12px;
  text-align: left;
  border-bottom: 1px solid #ddd;
  color: green; /* Change font color */
}

.table th {
  background-color: silver;
}

.table tbody tr:hover {
  background-color: #f2f2f2; /* Change hover background color */
  cursor: pointer; /* Change cursor to pointer on hover */
}

</style>
</head>
<body>
    <div class="container">
        <h2>User Details</h2>
        <table class="table table-hover">
            <thead>
                <tr>
                    <th>SL No</th>
                    <th>Registration No</th>
                    <th>Email</th>
                    <th>Ph Number</th>
                    <th>User Name</th>
                    
                </tr>
            </thead>
            <tbody>
                <c:forEach var="user" items="${userList}">
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.email}</td>
                        <td>${user.phoneNumber}</td>
                        <td>${user.userName}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
