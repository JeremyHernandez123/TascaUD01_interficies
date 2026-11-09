# TascaUD01_interficies
# Gestió de lloguer de videojocs

## Com executar-la

1. Clonar el repositori:
   ```
   git clone [URL]
   ```
2. Obrir NetBeans i anar a **File → Open Project**, i triar la carpeta del projecte.
3. Fer clic dret sobre el projecte i triar **Clean and Build**.
4. Prémer el botó verd **Run Project** (o F6). S'obrirà la finestra principal (`app.gui.MainScreen`).

## Com provar-la

1. Crea un usuari o més.
2. Crea un joc o més.
3. Registrar un lloguer des del menú "Lloguer → Registrar".
4. Tornar-lo des de "Lloguer → Tornar" i comprovar que l'estoc es recupera.
5. Provar d'esborrar un usuari o un joc amb un lloguer actiu: ha de sortir un missatge d'error.

## Estructura del projecte

- `app.dto`: les classes de dades i la lògica (`User`, `Joc`, `Lloguer`, `GestorLloguer`...)
- `app.gui`: les finestres de l'aplicació
- `app.validation`: la llibreria `ValidationAPI` amb les validacions

## Autor

Jeremy Samuel Hernández Fraga
