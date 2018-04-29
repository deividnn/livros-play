// @GENERATOR:play-routes-compiler
// @SOURCE:C:/livros/conf/routes
// @DATE:Sun Apr 29 15:03:05 BRT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseLivroController LivroController = new controllers.ReverseLivroController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseLivroController LivroController = new controllers.javascript.ReverseLivroController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
