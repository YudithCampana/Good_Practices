#: except Exception: pass y no cerrar archivos
# Intenta hacer algo y silencia cualquier error (mala práctica)
try:
    # Abre un archivo sin usar 'with' y sin cerrar después
    f = open("ejemplo.txt", "r", encoding="utf-8")
    # Lee una línea del archivo
    linea = f.readline()
    # Imprime la línea
    print(linea)
# Captura cualquier excepción y la ignora (mala práctica grave)
except Exception:
    # No muestra nada; los errores quedan ocultos
    pass
# Olvida cerrar el archivo, lo que puede causar fuga de recursos
# Falta: f.close()
