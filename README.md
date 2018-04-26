## How to install your first project

```
$ brew install node
$ brew install watchman
$ npm install -g react-native-cli
```

## If you want the latest RN

```
react-native init ReactNativeTutorial
```

## If you want to downgrade a version you can:
```
cd ReactNativeTutorial
npm i -S react-native@0.50.0
npm i -S react@16.0.0
```

## Before starting up your emulators, run:
```
react-native start --port=8081
OR
npm start
```

### To see if a port is busy:
```
lsof -i :8081
```

## To add a Native UI Component to Anroid, read the commit submitted with this comment.