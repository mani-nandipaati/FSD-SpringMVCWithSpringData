<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>

<head>
<title>Spring Data</title>
</head>
<body>
	<h1>Book Details ${messageTest}</h1>
	<c:choose>
		<c:when test="${books eq null or books.size() eq 0}">
			<h3>No Book Record(s) Found</h3>
		</c:when>
		<c:otherwise>
			<table border="1">
				<thead>
					<tr>
						<th>Book#</th>
						<th>Title</th>
						<th>PublishDate</th>
						<th>Price</th>
						<th>Volume</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="e" items="${books}">
						<tr>
							<th>${e.bookId}</th>
							<th>${e.title }</th>
							<th>${e.publishDate }</th>
							<th>${e.price }</th>
							<th>${e.volume }</th>
							<td> 
							<a href="delBook?bookId=${e.bookId}">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>


			</table>
		</c:otherwise>
	</c:choose>
	<br><br>
	<a href="home">Home</a>
</body>
</html>