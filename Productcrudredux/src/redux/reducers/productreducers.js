console.log('Start');

function delay(ms) {
  return new Promise((resolve) => setTimeout(resolve, ms));
}

async function run() {
  await delay(2000);
  console.log('End');
}

//run();

console.log('Middle');
