/* styling */
// promises
require('styles/main.scss');
/* js */
import { log, logTitle } from 'logger';
/* your imports */
logTitle('Promises & Fetch Api');

const getRandomUsers = n => {
    const fetchRandomUsers = fetch(`https://randomuser.me/api/?results=${n}`)
    fetchRandomUsers.then(data => {
        data.json().then(randomUsers => {
            log(JSON.stringify(randomUsers.results.length));
            randomUsers.results.forEach(user => {
                const {gender, email} = user;
                log(`${gender} - ${email}`);
            });
        })
    });
}

getRandomUsers(100);


/**
 * PROMISE ALL
 */


const namesPromise = new Promise((resolve, reject) => {
    setTimeout(() => {
        resolve(['Anna', 'Jones', 'Ali', 'Jake']);
    }, 3000);

    setTimeout(() => {
        reject("no data back from the server, there was an error");
    }, 5000);
});

const surnamesPromise = new Promise((resolve, reject) => {
    setTimeout(() => {
        resolve(['Williams', 'Bravo', 'Mohammado', 'Smith']);
    }, 3000);

    setTimeout(() => {
        reject("no data back from the server, there was an error");
    }, 5000);
});

Promise.all([namesPromise, surnamesPromise]).then(data => {
    const [names, surnames] = data;
    for (var i = 0; i < names.length; i++) {
        const name = names[i];
        const surname = surnames[i];
        log(`${name} ${surname}`);
    }

}).catch(error => {
    log(error);
});

