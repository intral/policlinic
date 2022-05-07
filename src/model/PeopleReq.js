
export class PeopleReq  {
    constructor(
        name,
        surname,
        patron,
        sex,
        birth_dt
    ){
     this.name = name;
     this.surname = surname;
     this.patron = patron;
     this.sex = sex;
     this.birth_dt = birth_dt;   
    }
    getSurname (){
        return this.surname;
    }
}
