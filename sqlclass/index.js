const { faker } = require("@faker-js/faker");
const mysql = require('mysql2');


const connection = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  database: 'delta_app',
  password:'Girhare@123123'
});

let q="insert into user(id,username,email,password) values ?";

let users=[["12a","123_newusera","abc@gmail.coma","abca"]
["12b","123_newuserb","abc@gmail.comb","abcb"]];

try{
    connection.query(q, [users],(err,result)=>{
    if(err)throw err;
     console.log(result);
      

});
}
catch(err){
    console.log(err);
}
connection.end();

// let createRandomUser = () => {
//   return {
//     Id: faker.string.uuid(),
//     username: faker.internet.username(),
//     email: faker.internet.email(),

//     password: faker.internet.password(),

//   };
// };

// console.log(createRandomUser());
