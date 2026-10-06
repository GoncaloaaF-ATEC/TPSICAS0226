from faker import Faker
from Pessoa import Contato, Pessoa


fake = Faker(locale='pt_PT')


c = Contato(fake.name(), fake.email())
print(c.nome)
print(c.email)

print(c)

print(c.__dict__)

p = Pessoa(fake.name(), fake.email())
print(p.__dict__)


def demo(idade = 0):
    print(idade)


demo(12)
demo()
