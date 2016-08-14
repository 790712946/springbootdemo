(function(angular) {
  var ItemFactory = function($resource) {
    return $resource('/items/', {
    });
  };
  
  ItemFactory.$inject = ['$resource'];
  angular.module("myApp.services").factory("Item", ItemFactory);
}(angular));