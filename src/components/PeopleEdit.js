import React from "react";
import PeopleReq from '../model/PeopleReq'
class PeopleED extends React.Component {
  constructor(props){
    super(props);

    this.state ={
     // PeopleReq : PeopleReq.su  
     surname : "lkl"
    }
  }
  SaveData(){
    console.log("Ну что то получилось");
    console.log("bkb ytn");
  }
  
  render(){
    return (
      <form>
        
      <input type="text" name="p_name" placeholder="Имя" defaultValue={this.state.surname}/>
      <input type="text" name="p_surname" placeholder="Фамилия"/>
      <input type="text" name="p_patron" placeholder="Отчество"/>
      <input type="text" name="p_birth_dt" placeholder="Дата рождения"/>
      <input type="text" name="p_sex" placeholder="Пол"/>
      <button onClick={this.SaveData}>Сохранить</button>
      </form>
    )
  }
}

export default PeopleED;
