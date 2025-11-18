const usuarios = {
  aluno: { email: "aluno@faculdade.br", senha: "aluno", tipo: "aluno" },
  professor: { email: "prof@faculdade.br", senha: "prof", tipo: "professor" },
  fornecedor: { email: "forn@faculdade.br", senha: "forn", tipo: "fornecedor" },
  admin: { email: "admin@faculdade.br", senha: "admin", tipo: "admin" }
};

function login(e) {
  e.preventDefault();
  const email = document.getElementById('email').value;
  const senha = document.getElementById('senha').value;
  for (let tipo in usuarios) {
    if (usuarios[tipo].email === email && usuarios[tipo].senha === senha) {
      localStorage.setItem('usuario', JSON.stringify(usuarios[tipo]));
      window.location.href = 'dashboard.html';
      return;
    }
  }
  alert('Email ou senha incorretos!');
}

function logout() {
  localStorage.removeItem('usuario');
  window.location.href = 'index.html';
}

function estaLogado() {
  return localStorage.getItem('usuario') !== null;
}

function getUsuario() {
  return JSON.parse(localStorage.getItem('usuario'));
}

// Protege páginas
if (window.location.pathname.includes('dashboard') || 
    window.location.pathname.includes('aluno') || 
    window.location.pathname.includes('fornecedor')) {
  if (!estaLogado()) window.location.href = 'index.html';
}