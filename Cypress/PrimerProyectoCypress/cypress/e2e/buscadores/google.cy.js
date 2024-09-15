describe('Buscador Google', () => {
  
  before(()=>{
    cy.log('*************************************')
  })

  after(()=>{
    cy.log('*************************************')
  })

  beforeEach(()=>{
    cy.visit('https://www.google.com')
  })

  context('Busquedas Basicas', ()=>{
    it('Buscar Cypress', () => {
      cy.get('#APjFqb').type('Cypress')
      cy.get('.aajZCb > .lJ9FBc > center > .gNO89b').click()
    })

    it('Buscar Formula 1', () => {
      cy.get('#APjFqb').type('Formula 1')
      cy.get('.aajZCb > .lJ9FBc > center > .gNO89b').click()
    })
  })
})