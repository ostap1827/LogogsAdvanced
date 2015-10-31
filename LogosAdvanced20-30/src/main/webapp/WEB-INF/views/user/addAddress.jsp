<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="<c:url value="/resources/css/users.css" />" rel="stylesheet">


<form action="users/create" method="POST">
	<div id="user_create">
		<div>
			<label for="userName">Country</label> <input id="userName" type="text"
				name="userName" class="form-control" placeholder="Country">
		</div>
		<div>
			<label for="email">City</label> <input id="email" type="email"
				name="email" class="form-control" placeholder="City">
		</div>
		<div>
			<label for="password">Street</label> <input id="password"
				type="password" name="password" class="form-control"
				placeholder="Street">
		</div>
		<div>
			<label for="password">House</label> <input id="password"
				type="password" name="password" class="form-control"
				placeholder="HouseNumber">
		</div>
		<div>
			<label for="password">Flat</label> <input id="password"
				type="password" name="password" class="form-control"
				placeholder="FlatNumber">
		</div>

		<button class="btn btn-sample" type="submit">Submit</button>
	</div>

</form>