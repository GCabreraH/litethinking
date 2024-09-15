describe('Demoblaze Store', () => {

  context('carrito de compras', () => {
    it('passes', () => {
      cy.visit('https://demoblaze.com/')
      cy.get("onclick=\"byCat('phone')\)")
    })
  })
})