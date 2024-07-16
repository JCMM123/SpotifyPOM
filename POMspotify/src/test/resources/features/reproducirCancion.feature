Feature:  Como usuario de spitify
  Quiero buscar y reproducir mi cancion
  para tener una reproduccion exitosa

  Background: Login exitoso
    Given que el usuario esta en la pagina principal de de spotify
    When el usuario ingresa sus credenciales

  @BusquedaCancion
  Scenario:Reproduccion exitosa
    When busca en la barra de busqueda su cancion y la selecciona
    Then el usuario escuchara su musica correctamente

