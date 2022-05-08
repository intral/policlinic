import React from "react";
import {LoginModel} from "../model/LoginModel";
import * as formUtilityActions from '../utility/FormUtility';

class SignIn extends React.Component {
  constructor(props) {

    super(props)

    this.onChangeModel =  this.onChangeModel.bind(this)
    this.Savedata = this.Savedata.bind(this)
  }
  // При отрисовки компонента заполним state сразу
  componentDidMount(){
    Object.keys(LoginModel()).forEach(x => this.setState({
      [x] : null 
    }));
  }
  // Любые изменения записываются в модель формы
  onChangeModel(e){
    this.setState({
      [e.target.name]: e.target.value  
    })  
    
  }
  //Сохраниние данных в БД
  Savedata(e){
     // e.preventDefault();
    console.log(LoginModel());
    console.log(JSON.stringify(this.state, null, 2));
  }

  render(){
    return(
      <div className="App">
        <div className="auth-wrapper">
          <div className="auth-inner">
            <div class="text-center">
              <form class="form-signin">
              <h1 class="h3 mb-3 font-weight-normal">Пожалуйста войдите, чтобы продолжить</h1>
              {/* Рендер модели */}
                {formUtilityActions.convertStateToArrayOfFormObjects({...LoginModel()}).map( (model) =>
                  <div class="mb-2">
                    <input
                      placeholder={model.config.label}
                      class="form-control"
                      required="" autofocus=""
                      id={model.id}
                      key={model.id}
                      name={model.id}
                      type={model.config.type}
                      onChange={this.onChangeModel}
                    />
                  </div>
                  ) 
                }
              </form>
              <button type="submit" class="btn btn-primary mb-2" onClick={this.Savedata}>Сохранить</button>
            </div>
          </div> 
        </div>
      </div>

    )
  }
}

export default SignIn;
