import React from "react";
import MainMenu from "./components/MainMenu";
import { Route, Routes } from 'react-router-dom';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import SignIn from "./components/SignIn";
class App extends React.Component {
  render(){
    return (
 
      <div className="App">
        <MainMenu />
      
            <Routes>
              <Route path='/SignIn' element={<SignIn />} />
            </Routes>

      </div>
    )
  }
}

export default App;
