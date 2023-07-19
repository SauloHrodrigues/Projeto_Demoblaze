#language: pt
Funcionalidade: Apresentação do vídeo na seção sobre a empresa;
    
   @0005 @ignorar
  Cenario: Cadastrar Usuário
    Dado estar no site 'https://www.demoblaze.com'
    Quando clicar no link 'About us'  
    Então validar elemento do video institucional da empresa