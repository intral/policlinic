import React from "react";
import { Link } from "react-router-dom";


class Main extends React.Component{
  render(){
    return(
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <Link  class="navbar-brand" to="/">Топовая Мис</Link>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
              <Link  class="nav-link" to="/">Домой</Link>
            </li>
            <li class="nav-item">
              <Link 
                class="nav-link" to="/SignIn">Войти
              </Link>
          
            </li>
          </ul>
        </div>
    </nav>
    );
  }

}
export default Main;
