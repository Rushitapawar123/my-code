const express = require("express");
const app = express();
const path=require("path");
const port = 8080;

app.use(express.static("public"));
app.set("view engine", "ejs");


app.set("views", path.join(__dirname,"/views"));

app.get("/", (req, res) => {
    res.render("home.ejs");
});

app.get("/ig/:username",(req, res)=>{

    const folowers=["Adem","rushi","sita","tanu","manu"]
    let {username}=req.params;
    console.log(username)
    res.render("instagram.ejs",{username,folowers});
})

app.get("/hello",(req,res)=>{
    res.send("hello");
});

app.get("/rolldice",(req,res)=>{
    let diceval=Math.floor(Math.random()*6)+1;
    res.render("rolldice.ejs", { diceval });
});


app.listen(port, () => {
    console.log(`Listening on port ${port}`);
});