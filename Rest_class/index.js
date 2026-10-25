const express = require("express");
const app = express();
const port = 8080;
const path = require("path");
const{v4:uuidv4}=require('uuid');
const methodOverride = require("method-override");

app.use(methodOverride("_method"));


app.use(express.urlencoded({ extended: true }));

app.set("view engine", "ejs");
app.set("views", path.join(__dirname, "views"));
app.use(express.static(path.join(__dirname, "public")));

let posts = [
    {id:uuidv4(), username: "rushitapawar", constent: "i love coding" },
     {id:uuidv4(), username: "rushipawar", constent: "i love codingtwo" },
      { id:uuidv4(),username: "shitapawar", constent: "i love my internship program" },
       {id:uuidv4(), username: "shita", constent: "thish is crazy" }

];

app.get("/posts", (req, res) => {
  res.render("index.ejs", { posts });
});

app.get("/posts/new",(req,res)=>{
  res.render("new.ejs");
});
app.post("/posts",(req,res)=>{
  let{username,constent}=req.body;
  let id=uuidv4()
 posts.push({id,username,constent});
  res.redirect("/posts")
});

app.get("/posts/:id", (req, res) => {
    let { id } = req.params;

    let post = posts.find((p) => id === p.id);

    res.render("show.ejs", { post });
});

app.patch("/posts/:id", (req, res) => {
    let { id } = req.params;

    let newContent = req.body.constent;

    let post = posts.find((p) => id === p.id);

    if (!post) {
        return res.status(404).send("Post not found");
    }

    post.constent = newContent;

    console.log(post);

    res.send("Patch request working");
});


app.get("/posts/:id/edit", (req, res) => {
    let { id } = req.params;

    let post = posts.find((p) => id === p.id);

    res.render("edit.ejs", { post });
});

app.listen(port, () => {
  console.log("listenning to port:8080");
});
