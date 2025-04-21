const os = require('os');
const fs = require('fs');
const path = require('path');

const addonPath = path.join(__dirname, `dist/x64/oceanAddon.node`);

if (fs.existsSync(addonPath)) {
  module.exports = require(addonPath);
} else {
  module.exports = {};
}
