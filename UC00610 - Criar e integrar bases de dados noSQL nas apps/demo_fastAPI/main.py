from fastapi import FastAPI

from modelo import Pessoa

app = FastAPI()


lista_pessoas = []

@app.get("/")
async def root():
    return {"message": "Hello World"}

@app.get("/info")
async def info():
    return {"message": "Infos"}


@app.get("/info/{nome}")
async def info_pessoa(nome: str):
    return {"message": f"Infos de {nome}"}



@app.get("/info/{nome}")
async def info_pessoa2(nome: str):
    return {"message": f"Infos de {nome}"}

# ... ?page=12&limit=30
@app.get("/contactos")
async def contactos(pag: int = 3, limit: int = 20 ):
    return {"message": f"contactos", "pagina": pag, "limit": limit}


@app.post("/pessoa")
async def create_pessoa(pessoa: Pessoa):
    lista_pessoas.append(pessoa)
    return {"pessoa": pessoa,
        "message": f"Pessoa criada com sucesso"}


@app.get("/pessoa")
async def create_pessoa():
    return lista_pessoas