'use strict';

angular.module('tagstered').controller('UserController',
		[ '$scope', 'UserService', function($scope, UserService) {
			$scope.id = $routeParams.id;
		} ]);