#: nombres claros, typing, docstrings y función pura
# Importa tipos opcionales para anotar la función (opcional para principiantes)
from typing import Optional

# Define una función con nombre claro que calcula el total con descuento
def calcular_total(precio_unitario: float, cantidad: int, descuento: float = 0.0) -> float:
    """Calcula el total a pagar aplicando un descuento opcional.

    Args:
        precio_unitario: Precio de un artículo (debe ser positivo).
        cantidad: Unidades a comprar (debe ser >= 1).
        descuento: Porcentaje de descuento entre 0.0 y 1.0.

    Returns:
        Total a pagar como número flotante.
    """
    # Valida que el precio sea mayor a cero
    if precio_unitario <= 0:
        raise ValueError("El precio debe ser positivo")
    # Valida que la cantidad sea al menos 1
    if cantidad <= 0:
        raise ValueError("La cantidad debe ser positiva")
    # Calcula el subtotal multiplicando precio por cantidad
    subtotal = precio_unitario * cantidad
    # Limita el descuento para que esté entre 0 y 1
    descuento = max(0.0, min(descuento, 1.0))
    # Calcula el total aplicando el descuento
    total = subtotal * (1 - descuento)
    # Devuelve el total calculado
    return total

# Llama a la función con valores de ejemplo e imprime el resultado
print("Total:", calcular_total(100.0, 2, 0.1))
