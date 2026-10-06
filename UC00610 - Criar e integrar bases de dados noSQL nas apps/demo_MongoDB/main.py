# pip install pymongo

from bson import ObjectId
from Pessoa import Pessoa
from pymongo import MongoClient
from pymongo.collection import Collection

from faker import Faker

fake = Faker(locale='pt_PT')

client = MongoClient("mongodb://root:rootpass@localhost:27017/")

# print(client.server_info())

print(client.list_database_names())


db = client['lista_Contactos']

#collection = db['Contactos']

collection = db.get_collection("Contactos")

collection.insert_one({'nome': 'João', 'email': 'joao@mail.com'})

## adicionar mais de um contacto de uma vez
#collection.insert_many([{'nome': fake.name(), 'email': fake.email()},
#                         {'nome': fake.name(), 'email': fake.email()}])




print(collection.count_documents({}))

for elm in collection.find({}, {"_id":0}):
    print(elm)


res = list(collection.find({}, {"_id":0}))

print(res)


pessoa =  {'nome': fake.name(), 'email': fake.email()}


p = Pessoa(fake.name(), fake.email())
print(p)

p2 = Pessoa(fake.name(), fake.email())
print(p2)

p2.morada = fake.address()

print(p2.morada)



data = collection.insert_one({'nome': fake.name(), 'email': fake.email()})

print(data.inserted_id)

#                 6a46ba02a65853bd46f994aa
my_id = ObjectId("11a1314a131ae44131a13a1b")

print(type(my_id))



data2 = collection.insert_many([{'nome': fake.name(), 'email': fake.email()},
                                {'nome': fake.name(), 'email': fake.email()}])


print(data2.inserted_ids[0])