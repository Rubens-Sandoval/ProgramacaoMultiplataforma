const express = require("express")
const app = express()

const Sequelize = require("sequelize")
const sequelize = new Sequelize("banco", "root", "",{
    host: "localhost",
    dialect: "mysql"
})

sequelize.authenticate().then(function(){
    console.log("Conectado com sucesso!")
}).catch(function(erro){
    console.log("Erro ao conectar: " + erro)
})

//Gerando tabela do banco de dados
const Users = sequelize.define("users",{
    nome:{
        type: Sequelize.STRING
    },
    email:{
        type: Sequelize.STRING
    },
    senha:{
        type: Sequelize.STRING
    }
})

//Depois da primeira execução comentar a linha abaixo:
//Users.sync({force: true})

//Startando o servidor
app.listen(8081, function(){
    console.log("Servidor ativo")
})

//Rota raíz
app.get("/", function(req, res){
    console.log("Página principal")
    res.send("Primeira página")
})

//Rota de cadastro
app.get("/cadastrar", async function(req, res) {
    console.log("Página cadastrada")
    res.send("Primeira cadastrada")
    
    // Inserindo registro na tabela 'Users'
    Users.create({
        nome: "JP",
        email: "jp@gmail.com",
        senha: "jp2005"
    })
  });
  