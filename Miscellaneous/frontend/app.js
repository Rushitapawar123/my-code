// let arr=[1,2,3,66,7,8,9,6,5,4,35,7,8,43];

// arr.sayhello=()=>{
//     console.log("hello ,i ma arr")
// };

// function  Personmaker(name,age){
//     const person={
//         name:name,
//         age:age,
//         talk(){
//             console.log(`hi, my name is ${this.name}`);
//         },
//     };
//     return person;
// }

// let p1=Personmaker("Rushi",21);

// function  Person(name,age){
    
//        this.name=name;
//    this.age=age;
//     }

//     Person.prototype.talk=function(){
//         console.log(`hi my name is ${this.name}`);
//     };

//     let p1=new Person("sita",33);
//     let p2=new Person("gita",34);


// class Person{
//     constructor(name,age){
//         this.name=name;
//         this.age=age;
        
//     }
//     talk(){
//         console.log(`hi my name is ${this.name}`);
//     }
// }

// let p1= new Person("rushi",22);
// let p2=new Person("gita",34);


// class person{
//     constructor(name,age){
//         this.name=name;
//         this.age=age;
//     }
//     talk(){
//         console.log(`Hi, i am $(this.name)`);
//     }
// }

// class Stdent extends person{
//     constructor(name,age,marks){
//         // this.name=name;
//         // this.age=age;
//         super(name,age);
//         this.marks=marks;
//     }
//     talk(){
//         console.log(`hi ,i am $(this.name)`);
//     }
// }


// class techer extends person{
//     constructor(name,age,sub){
//         // this.name=name;
//         // this.age=age;
//         super(name,age);
//         this.sub=sub;
//     }
//     talk(){
//         console.log(`hi ,i am $(this.name)`);
//     }
// }


// let stu1=new Stdent("tanu",11,88);
// let tech1=new Stdent("manu",11,88);




class Mamal{
    constructor(name){
        this.name=name;
        this.type="warm-bloodes";
    }
    eat(){
        console.log("I am eating");
    }
}

class Dog extends Mamal{
    constructor(name){
        super(name);
    }
    bark(){
        console.log("wooof..");
    }
}

class Cat extends Mamal{
    constructor(name){
        super(name);
        }
        meow(){
            console.log("meoww..")
        
    }
}

