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
		
		<!-- Bootstrap CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		</head>
	<body>
	<p>Welcome to the advisor homepage</p>
	<p>select an option</p> <br>
	
	<div id="hi"></div>
	<div id="nav"></div>

	<a href="${pageContext.request.contextPath}/advisor/addStudent"> Add a Student </a> <br>
	<a href="${pageContext.request.contextPath}/advisor/searchStudent"> Search for a Student </a>

	<img src="../reactComponents/ape.png">


	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
    	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	</body>

	<script type="text/babel">
		class App extends React.Component {
			  shoot() {
    			alert("Great Shot!");
  				}
			render() {
				return (
					<div className="app-content">
						
						<div className="container">
  							<h1>Yo!</h1>
						</div>
						<button onClick={this.shoot}>Take the shot!</button>
					</div>
				);
			}
		}

		ReactDOM.render(<App />, document.getElementById('hi'));
	</script>
	
	<script type="text/babel">
	class Navigation extends React.Component {
		  render() {
		    return (
		      <nav className="navbar navbar-expand-lg navbar-light bg-light">
		        <a className="navbar-brand" href="/">Navbar</a>
		        <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		          <span className="navbar-toggler-icon"></span>
		        </button>

		        <div className="collapse navbar-collapse" id="navbarSupportedContent">
		          <ul className="navbar-nav mr-auto">
		            <li className="nav-item active">
		              <a className="nav-link" href="/">Home <span className="sr-only">(current)</span></a>
		            </li>
		            <li className="nav-item">
		              <a className="nav-link" href="/">Link</a>
		            </li>
		            <li className="nav-item dropdown">
		              <a className="nav-link dropdown-toggle" href="/" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		                Dropdown
		              </a>
		              <div className="dropdown-menu" aria-labelledby="navbarDropdown">
		                <a className="dropdown-item" href="/">Action</a>
		                <a className="dropdown-item" href="/">Another action</a>
		                <div className="dropdown-divider"></div>
		                <a className="dropdown-item" href="/">Something else here</a>
		              </div>
		            </li>
		            <li className="nav-item">
		              <a className="nav-link disabled" href="/">Disabled</a>
		            </li>
		          </ul>
		          <form className="form-inline my-2 my-lg-0">
		            <input className="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" />
		            <button className="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		          </form>
		        </div>
		      </nav>
		    )
		  }
		}
				ReactDOM.render(<Navigation />, document.getElementById('nav'));
	</script>
	
</html>

<!-- 

	<% String username = request.getParameter("username"); %>
	<% out.println(username); %>


 -->
