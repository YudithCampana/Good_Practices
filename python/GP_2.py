#: leer archivos con with y manejar excepciones específicas
# Intenta abrir y leer un archivo de texto de forma segura
try:
    # Usa 'with' para abrir el archivo y cerrarlo automáticamente al terminar
    with open("ejemplo.txt", "r", encoding="utf-8") as f:
        # Lee todo el contenido del archivo
        contenido = f.read()
        # Imprime el contenido en la consola
        print(contenido)
# Captura el error cuando el archivo no existe o no se puede abrir
except FileNotFoundError as e:
    # Muestra un mensaje amigable con el motivo del error
    print("No se encontró el archivo:", e)
