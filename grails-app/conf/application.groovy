

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'de.preyer.expenses.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'de.preyer.expenses.UserRole'
grails.plugin.springsecurity.authority.className = 'de.preyer.expenses.Role'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']],
	[pattern: '/api/login',      access: ['permitAll']],
	[pattern: '/api/logout',     access: ['isFullyAuthenticated()']],
	[pattern: '/Partners/**',    access: ['isFullyAuthenticated()']],
	[pattern: '/**',             access: ['isFullyAuthenticated()']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
	//[pattern: '/assets/**',      filters: 'none'],
	//[pattern: '/**/js/**',       filters: 'none'],
	//[pattern: '/**/css/**',      filters: 'none'],
	//[pattern: '/**/images/**',   filters: 'none'],
	//[pattern: '/**/favicon.ico', filters: 'none'],
	//[pattern: '/**',             filters: 'JOINED_FILTERS']
	[pattern: '/api/**', filters:'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,-authenticationProcessingFilter,-securityContextPersistenceFilter,-rememberMeAuthenticationFilter'],
	[pattern: '/**', filters:'JOINED_FILTERS,-restTokenValidationFilter,-restExceptionTranslationFilter']

]
grails.plugin.springsecurity.interceptUrlMap = [
		[pattern: '/',                      access: ['permitAll']],
		[pattern: '/error',                 access: ['permitAll']],
		[pattern: '/index',                 access: ['permitAll']],
		[pattern: '/index.gsp',             access: ['permitAll']],
		[pattern: '/shutdown',              access: ['permitAll']],
		[pattern: '/assets/**',             access: ['permitAll']],
		[pattern: '/**/js/**',              access: ['permitAll']],
		[pattern: '/**/css/**',             access: ['permitAll']],
		[pattern: '/**/images/**',          access: ['permitAll']],
		[pattern: '/**/favicon.ico',        access: ['permitAll']],
		[pattern: '/login/**',              access: ['permitAll']],
		[pattern: '/logout',                access: ['permitAll']],
		[pattern: '/logout/**',             access: ['permitAll']],
		[pattern: '/api/login',             access: ['ROLE_ANONYMOUS']],
		[pattern: '/oauth/access_token',    access: ['ROLE_ANONYMOUS']],
        [pattern: '/api/partners/findAllByPayors',   access: ['ROLE_USER'], httpMethod: 'GET'],
        [pattern: '/api/partners/findAllByCostCenter',   access: ['ROLE_USER'], httpMethod: 'GET'],
        [pattern: '/api/partners/findAllByClient',   access: ['ROLE_USER'], httpMethod: 'GET'],
		[pattern: '/api/partners',     access: ['ROLE_USER'], httpMethod: 'GET'],
		[pattern: '/api/partners/*',   access: ['ROLE_USER'], httpMethod: 'GET'],
		[pattern: '/api/partners/*',   access: ['ROLE_USER'], httpMethod: 'DELETE'],
		[pattern: '/api/partners',     access: ['ROLE_USER'], httpMethod: 'POST'],
		[pattern: '/api/partners/*',   access: ['ROLE_USER'], httpMethod: 'PUT'],
        [pattern: '/api/countries',     access: ['ROLE_USER'], httpMethod: 'GET'],
        [pattern: '/api/ccys',     access: ['ROLE_USER'], httpMethod: 'GET'],
        [pattern: '/api/trips',     access: ['ROLE_USER'], httpMethod: 'GET'],
        [pattern: '/api/trips/*',   access: ['ROLE_USER'], httpMethod: 'GET'],
        [pattern: '/api/trips/*',   access: ['ROLE_USER'], httpMethod: 'DELETE'],
        [pattern: '/api/trips',     access: ['ROLE_USER'], httpMethod: 'POST'],
        [pattern: '/api/trips/*',   access: ['ROLE_USER'], httpMethod: 'PUT'],
]
grails.plugin.springsecurity.rest.login.active = true
grails.plugin.springsecurity.rest.login.useJsonCredentials = true
grails.plugin.springsecurity.rest.login.failureStatusCode = 401
grails.plugin.springsecurity.rest.login.usernamePropertyName =	'username'
grails.plugin.springsecurity.rest.login.passwordPropertyName =	'password'
grails.plugin.springsecurity.rest.login.endpointUrl = '/api/login'
grails.plugin.springsecurity.rest.logout.endpointUrl='/api/logout'
// Spring Security Rest Token Validation
grails.plugin.springsecurity.rest.token.validation.active =	true
grails.plugin.springsecurity.rest.token.validation.endpointUrl = '/api/validate'
grails.plugin.springsecurity.rest.token.validation.useBearerToken = true
grails.plugin.springsecurity.rest.token.validation.headerName = 'X-Auth-Token'

// Spring Security Rest using JWT

grails.plugin.springsecurity.rest.token.storage.jwt.secret = 'aloohaisalongenoughstringwhen backwards it is used'
grails.plugin.springsecurity.rest.token.storage.useJwt = true
grails.plugin.springsecurity.rest.token.storage.jwt.useSignedJwt = true

grails.plugin.springsecurity.rest.token.storage.jwt.expiration = 86400 // 24 hours

//grails.plugin.springsecurity.rest.token.storage.gorm.tokenDomainClassName=de.preyer.expenses.AuthenticationToken
//grails.plugin.springsecurity.rest.token.storage.gorm.tokenValuePropertyName=tokenValue
//grails.plugin.springsecurity.rest.token.storage.gorm.usernamePropertyName=username

//grails.plugin.springsecurity.rest.token.storage.memcached.hosts = 'localhost:11211'
//grails.plugin.springsecurity.rest.token.storage.memcached.username = ''
//grails.plugin.springsecurity.rest.token.storage.memcached.password = ''
//grails.plugin.springsecurity.rest.token.storage.memcached.expiration = 86400