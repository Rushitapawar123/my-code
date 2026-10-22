const express = require("express");
const app = express();
const port = 8080;
const path = require("path");

app.use(express.urlencoded({ extended: true }));

app.set("view engine", "ejs");
app.set("views", path.join(__dirname, "views"));
app.use(express.static(path.join(__dirname, "public")));

let posts = [
    { username: "rushitapawar", constent: "i love coding" },
     { username: "rushipawar", constent: "i love codingtwo" },
      { username: "shitapawar", constent: "i love my internship program" },
       { username: "shita", constent: "thish is crazy" }

];

app.get("/posts", (req, res) => {
  res.render("index.ejs", { posts });
});

app.listen(port, () => {
  console.log("listenning to port:8080");
});
