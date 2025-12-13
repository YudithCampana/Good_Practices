Good Practices Challenge

¡Bienvenido al repositorio de Buenas Prácticas de Programación!
Aquí encontrarás ejemplos en Java, Python, C++ y JavaScript diseñados con errores intencionales para que los corrijas aplicando principios fundamentales de desarrollo limpio.

¿Qué debes hacer?
Explora los ejemplos in main/ (especialmente los que son en Java)
  
- Ve a **Issues** y selecciona el reto que vas a resolver. Cada Issue contiene:

El código base con problemas.
Pistas en el title para guiar tu refactorización.

Tu misión

Aplica KISS: Mantén el código simple y fácil de entender.
Aplica DRY: Elimina duplicación, reutiliza funciones comunes.
Aplica SOLID (SRP): Cada método debe tener una sola responsabilidad y devolver valores en lugar de mezclar lógica con presentación.

Cómo participar!

# ============================================================
# Actividad: Resolución de Issues en GitHub
# Repositorio: https://github.com/YudithCampana/Good_Practices
# ============================================================

# OBJETIVO
# Cada estudiante deberá seleccionar uno o más issues abiertos en el repositorio público
# y proponer una solución mediante código y documentación adecuada, aplicando buenas
# prácticas de programación y flujos correctos de trabajo con Git y GitHub.

# ------------------------------------------------------------
# INSTRUCCIONES PARA RESOLVER ISSUES 
# ------------------------------------------------------------

# 1) Acceder y seleccionar issues
# - Ir al repositorio: https://github.com/YudithCampana/Good_Practices
# - Abrir la pestaña "Issues".
# - Elegir un issue marcado como disponible,


# 2) Hacer un fork del repositorio (sin permisos de escritura directos)
# - En GitHub, presionar el botón "Fork" para crear una copia del repo en su cuenta.

# 3) Clonar el fork en su computadora
#   git clone https://github.com/TU_USUARIO/Good_Practices.git
#   cd Good_Practices

# 4) Crear una rama de trabajo específica para el issue
#   git checkout -b solucion-issue-<numero>
# Ejemplos:
#   git checkout -b solucion-issue-12
#   git checkout -b solucion-issue-bug-formato

# 5) Implementar la solución
# - Corregir/implementar lo solicitado en el issue.
# - Aplicar buenas prácticas:
#   * Nombrado significativo
#   * Documentación (docstrings, comentarios claros)
#   * Manejo específico de excepciones
#   * Separación de responsabilidades
#   * Pruebas (unitarias o de integración, según corresponda)
# - Si el issue requiere ejemplos, agregarlos en una carpeta adecuada (p.ej., "examples/").

# 7) Guardar y subir cambios a su fork
#   git add .
#   git commit -m "Solución al issue #<numero>: descripción breve"
#   git push origin solucion-issue-<numero>

# 8) Crear un Pull Request (PR) hacia el repositorio original
# - En su fork, presionar "Compare & Pull Request".
# - Verificar que el PR apunte a "YudithCampana/Good_Practices".
# - En el mensaje del PR incluir:
#   * Número del issue (ej.: #12)
#   * Nombres de los dos integrantes del equipo
#   * Breve resumen de la solución y de las buenas prácticas aplicadas
#   * Instrucciones para probar, si es necesario

# ------------------------------------------------------------
# FORMATO DE NOMBRES Y ESTRUCTURA SUGERIDA
# ------------------------------------------------------------

# Ramas:
#   solucion-issue-<numero>
#   Ej.: solucion-issue-12

# (Opcional) Carpeta por problema:
#   Issue_<numero>_<TituloProblema>/
#   - src/               (código fuente)
#   - tests/             (pruebas)
#   - README.md          (documentación de la solución)
#   - examples/          (ejemplos de uso si aplica)

# Código fuente:
#   [TituloProblema].[ext]
#   Ej.: CalculoPromedio.py, ValidacionEntrada.js

# NOTAS FINALES
# ------------------------------------------------------------

# - Esta actividad se centra en resolver issues del repositorio YudithCampana/Good_Practices.
# - Es de trabajo individual para obtener puntos extras en la asignatura
# - Los PR serán revisados, y de ser aprobados, se integrarán al repositorio original.
# - Eviten conflictos coordinando la selección de issues o comunicando en los comentarios del issue.
# - Mantengan su fork sincronizado con el upstream para evitar divergencias:
#     git remote add upstream https://github.com/YudithCampana/Good_Practices.git
#     git fetch upstream
#     git merge upstream/main  # o rebase si lo prefiere








