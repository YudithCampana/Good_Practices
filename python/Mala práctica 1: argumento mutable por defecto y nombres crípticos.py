
# Define una función con una lista por defecto (mala práctica)
def agregar(item, lista=[]):
    # Agrega el elemento a la lista por defecto, compartida entre llamadas
    lista.append(item)
    # Devuelve la lista modificada
    return lista

# Llama varias veces y la lista crece sin que el usuario lo espere
print(agregar("a"))  # ['a']
print(agregar("b"))  # ['a', 'b'] ← sorprendente (usa misma lista)
