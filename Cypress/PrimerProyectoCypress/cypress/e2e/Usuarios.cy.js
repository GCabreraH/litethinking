describe('Usuarios', () => {

  before(()=>{
    cy.log('Autenticacion a una base de datos')
  })

  beforeEach(()=>{
    cy.log('Usuario genera un login exitoso.')
  })

  afterEach(()=>{
    cy.log('Cerrar Sesion')
  })

  after(()=> {
    cy.log('Desconectarse de la Base de Datos')
  })

  context('Creacion', ()=>{
    it('Crear un usuario con rol Administrador', ()=>{
      cy.log('Hemos creado un usuario Administrador')
    })
    it('Crear un usuario con rol Cliente', ()=>{
      cy.log('Hemos creado un usuario Cliente')
    })
    it('Crear un usuario con rol Empleado', ()=>{
      cy.log('Hemos creado un usuario Empleado')
    })
  })

  context('Actualizar', ()=>{
    it('Actualizar la direccion del Usuario', ()=>{
      cy.log('Hemos actualizado la direccion')
    })
    it('Actualizar el email del usaurio', ()=>{
      cy.log('Hemos actualizado la direccion')
    })
  })

  context('Eliminar', ()=>{
    it('Actualizar la direccion del Usuario', ()=>{
      cy.log('Hemos actualizado la direccion')
    })
    it('Actualizar el email del usaurio', ()=>{
      cy.log('Hemos actualizado la direccion')
    })
  })

  context('Consultar', ()=>{
    it('Actualizar la direccion del Usuario', ()=>{
      cy.log('Hemos actualizado la direccion')
    })
    it('Actualizar el email del usaurio', ()=>{
      cy.log('Hemos actualizado la direccion')
    })
  })


})