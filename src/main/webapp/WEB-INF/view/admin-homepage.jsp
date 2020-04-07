<%--
  Created by IntelliJ IDEA.
  User: Fabian
  Date: 3/2/2020
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
    	<title>Advisor Homepage</title>
    	<script crossorigin src="https://unpkg.com/react@16/umd/react.production.min.js"></script>
		<script crossorigin src="https://unpkg.com/react-dom@16/umd/react-dom.production.min.js"></script>
		<script src="https://unpkg.com/@babel/standalone/babel.min.js"></script>
	</head>
	<body>
	<p>Welcome to the advisor homepage</p>
	<p>select an option</p> <br>
	
	<div id="app"></div>

	<a href="${pageContext.request.contextPath}/advisor/addStudent"> Add a Student </a> <br>
	<a href="${pageContext.request.contextPath}/advisor/searchStudent"> Search for a Student </a>


	</body>
	
	<script type="text/babel">
		class App extends React.Component {
			render() {
				return (
					<div className="app-content">
						<h1>Yo!</h1>
					</div>
				)
			}
		}

		ReactDOM.render(<App />, document.getElementById('app'));
	</script>
	
</html>
