Feature:  Como usuario de spitify
  Quiero buscar y reproducir mi cancion
  para tener una reproduccion exitosa

  Background: Login exitoso
    Given el usuario esta logeado en el sitio web de spotify

  Scenario:Reproduccion exitosa
    When busca en la barra de busqueda su cancion y la selecciona
    Then el usuario escuchara su musica correctamente

