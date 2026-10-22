const express =require("express");
const app= express();
const port=8080;



app.use(express.urlencoded({extended:true}));
app.use(express.json());



app.get("/register",(req,res)=>{
    let {user,password}=req.query;
    res.send(`standerd Get response:welcome ${user}!`);
})


app.post("/register",(req,res)=>{
  let {user,password}=req.body;
    res.send("standerd post responce");
})

app.listen(port,()=>{
    console.log(`listnning to port${port}`);
})