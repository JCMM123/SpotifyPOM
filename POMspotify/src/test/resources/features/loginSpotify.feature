Feature: logeo exitoso en Spotify

  @Todito
  @loginSpotify
  Scenario:logeo exitoso
    Given que el usuario esta en la pagina principal de de spotify
    When el usuario ingresa sus credenciales
    Then el usuario ve su perfil en la parte superior de la pagina principal
