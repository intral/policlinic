import React from "react";
import Main from "./components/Main";
import People from "./components/People";
import PeopleED from "./components/PeopleEdit";
class App extends React.Component {
  render(){
    return (
      <div>
      <Main />
      <People />
      <PeopleED />
      </div>
    )
  }
}

export default App;
