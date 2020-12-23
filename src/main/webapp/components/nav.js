"use strict";

function _instanceof(left, right) {
  if (
    right != null &&
    typeof Symbol !== "undefined" &&
    right[Symbol.hasInstance]
  ) {
    return right[Symbol.hasInstance](left);
  } else {
    return left instanceof right;
  }
}

function _typeof(obj) {
  if (typeof Symbol === "function" && typeof Symbol.iterator === "symbol") {
    _typeof = function _typeof(obj) {
      return typeof obj;
    };
  } else {
    _typeof = function _typeof(obj) {
      return obj &&
        typeof Symbol === "function" &&
        obj.constructor === Symbol &&
        obj !== Symbol.prototype
        ? "symbol"
        : typeof obj;
    };
  }
  return _typeof(obj);
}

function _classCallCheck(instance, Constructor) {
  if (!_instanceof(instance, Constructor)) {
    throw new TypeError("Cannot call a class as a function");
  }
}

function _defineProperties(target, props) {
  for (var i = 0; i < props.length; i++) {
    var descriptor = props[i];
    descriptor.enumerable = descriptor.enumerable || false;
    descriptor.configurable = true;
    if ("value" in descriptor) descriptor.writable = true;
    Object.defineProperty(target, descriptor.key, descriptor);
  }
}

function _createClass(Constructor, protoProps, staticProps) {
  if (protoProps) _defineProperties(Constructor.prototype, protoProps);
  if (staticProps) _defineProperties(Constructor, staticProps);
  return Constructor;
}

function _possibleConstructorReturn(self, call) {
  if (call && (_typeof(call) === "object" || typeof call === "function")) {
    return call;
  }
  return _assertThisInitialized(self);
}

function _assertThisInitialized(self) {
  if (self === void 0) {
    throw new ReferenceError(
      "this hasn't been initialised - super() hasn't been called"
    );
  }
  return self;
}

function _getPrototypeOf(o) {
  _getPrototypeOf = Object.setPrototypeOf
    ? Object.getPrototypeOf
    : function _getPrototypeOf(o) {
        return o.__proto__ || Object.getPrototypeOf(o);
      };
  return _getPrototypeOf(o);
}

function _inherits(subClass, superClass) {
  if (typeof superClass !== "function" && superClass !== null) {
    throw new TypeError("Super expression must either be null or a function");
  }
  subClass.prototype = Object.create(superClass && superClass.prototype, {
    constructor: { value: subClass, writable: true, configurable: true }
  });
  if (superClass) _setPrototypeOf(subClass, superClass);
}

function _setPrototypeOf(o, p) {
  _setPrototypeOf =
    Object.setPrototypeOf ||
    function _setPrototypeOf(o, p) {
      o.__proto__ = p;
      return o;
    };
  return _setPrototypeOf(o, p);
}

var Navigation =
  /*#__PURE__*/
  (function(_React$Component) {
    _inherits(Navigation, _React$Component);

    function Navigation() {
      _classCallCheck(this, Navigation);

      return _possibleConstructorReturn(
        this,
        _getPrototypeOf(Navigation).apply(this, arguments)
      );
    }

    _createClass(Navigation, [
      {
        key: "render",
        value: function render() {
          return React.createElement(
            "nav",
            {
              className: "navbar navbar-expand-lg navbar-dark bg-dark"
            },
            React.createElement(
              "a",
              {
                className: "navbar-brand",
                href: "#"
              },
              "Advisor"
            ),
            React.createElement(
              "button",
              {
                className: "navbar-toggler",
                type: "button",
                "data-toggle": "collapse",
                "data-target": "#navbarSupportedContent",
                "aria-controls": "navbarSupportedContent",
                "aria-expanded": "false",
                "aria-label": "Toggle navigation"
              },
              React.createElement("span", {
                className: "navbar-toggler-icon"
              })
            ),
            React.createElement(
              "div",
              {
                className: "collapse navbar-collapse",
                id: "navbarSupportedContent"
              },
              React.createElement(
                "ul",
                {
                  className: "navbar-nav mr-auto"
                },
                React.createElement(
                  "li",
                  {
                    className: "nav-item active"
                  },
                  React.createElement(
                    "a",
                    {
                      className: "nav-link",
                      href: "#"
                    },
                    "Home ",
                    React.createElement(
                      "span",
                      {
                        className: "sr-only"
                      },
                      "(current)"
                    )
                  )
                ),
                React.createElement(
                  "li",
                  {
                    className: "nav-item dropdown"
                  },
                  React.createElement(
                    "a",
                    {
                      className: "nav-link dropdown-toggle",
                      href: "#",
                      id: "navbarDropdown",
                      role: "button",
                      "data-toggle": "dropdown",
                      "aria-haspopup": "true",
                      "aria-expanded": "false"
                    },
                    "Modify Student"
                  ),
                  React.createElement(
                    "div",
                    {
                      className: "dropdown-menu",
                      "aria-labelledby": "navbarDropdown"
                    },
                    React.createElement(
                      "a",
                      {
                        className: "dropdown-item",
                        href: contextMapping + "/advisor/addStudent"
                      },
                      "Add Student"
                    ),
                    React.createElement(
                      "a",
                      {
                        className: "dropdown-item",
                        href: contextMapping + "/advisor/removeStudent"
                      },
                      "Remove Student"
                    )
                  )
                ),
                React.createElement(
                  "li",
                  {
                    className: "nav-item dropdown"
                  },
                  React.createElement(
                    "a",
                    {
                      className: "nav-link dropdown-toggle",
                      href: "#",
                      id: "navbarDropdown",
                      role: "button",
                      "data-toggle": "dropdown",
                      "aria-haspopup": "true",
                      "aria-expanded": "false"
                    },
                    "Modify College"
                  ),
                  React.createElement(
                    "div",
                    {
                      className: "dropdown-menu",
                      "aria-labelledby": "navbarDropdown"
                    },
                    React.createElement(
                      "a",
                      {
                        className: "dropdown-item",
                        href: contextMapping + "/advisor/addMajor"
                      },
                      "Add Major"
                    ),
                    React.createElement(
                      "a",
                      {
                        className: "dropdown-item",
                        href: contextMapping + "/advisor/addSection"
                      },
                      "Add Section"
                    ),
                    React.createElement(
                      "a",
                      {
                        className: "dropdown-item",
                        href: contextMapping + "/advisor/addProfessor"
                      },
                      "Add Professor"
                    ),
                    React.createElement(
                      "a",
                      {
                        className: "dropdown-item",
                        href: contextMapping + "/advisor/removeMajor"
                      },
                      "Remove Major"
                    ),
                    React.createElement(
                      "a",
                      {
                        className: "dropdown-item",
                        href: contextMapping + "/advisor/removeSection"
                      },
                      "Remove Section"
                    ),
                    React.createElement(
                      "a",
                      {
                        className: "dropdown-item",
                        href: contextMapping + "/advisor/removeProfessor"
                      },
                      "Remove Professor"
                    )
                  )
                ),
                React.createElement(
                  "li",
                  {
                    className: "nav-item dropdown"
                  },
                  React.createElement(
                    "a",
                    {
                      className: "nav-link dropdown-toggle",
                      href: "#",
                      id: "navbarDropdown",
                      role: "button",
                      "data-toggle": "dropdown",
                      "aria-haspopup": "true",
                      "aria-expanded": "false"
                    },
                    "Search"
                  ),
                  React.createElement(
                    "div",
                    {
                      className: "dropdown-menu",
                      "aria-labelledby": "navbarDropdown"
                    },
                    React.createElement(
                      "a",
                      {
                        className: "dropdown-item",
                        href: contextMapping + "/advisor/searchStudent"
                      },
                      "Search Student"
                    ),
                    React.createElement(
                      "a",
                      {
                        className: "dropdown-item",
                        href: contextMapping + "/advisor/searchMajor"
                      },
                      "Search Major"
                    ),
                    React.createElement(
                      "a",
                      {
                        className: "dropdown-item",
                        href: contextMapping + "/advisor/searchSection"
                      },
                      "Search Section"
                    ),
                    React.createElement(
                      "a",
                      {
                        className: "dropdown-item",
                        href: contextMapping + "/advisor/searchProfessor"
                      },
                      "Search Professor"
                    )
                  )
                ),
                React.createElement(
                  "li",
                  {
                    className: "nav-item"
                  },
                  React.createElement(
                    "a",
                    {
                      className: "nav-link",
                      href: "#"
                    },
                    "Logout"
                  )
                )
              )
            )
          );
        }
      }
    ]);

    return Navigation;
  })(React.Component);

ReactDOM.render(
  React.createElement(Navigation, null),
  document.getElementById("nav")
);
