const  express=require("express");
const app=express();
let port=8080;

app.listen(port,()=>{
    console.log(`app is listning  port ${port}`);
});

app.use((req,res)=>{
    console.log("request recive")
})